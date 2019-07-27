# Compiler_Project
## Compiler's project overview:

This project will direct you to design and build an interpreter for Cool. Each phase will cover one component of the interpreter:    lexical analysis, parsing, and code generation in three address code. Each phase will ultimately result in a working compiler phase which can interface with the other phases.

## Prerequisites
- Install any  ide such as Intellij, NetBeans, Eclipse (Intellij is preferred )
- then follow this link : https://github.com/antlr/antlr4/blob/master/doc/java-target.md
- bring your grammar (in this project it is COOL.g4)
- press Ctrl+Shift+G

Then our environment is ready  :D
## Structure
## 1)Lexical analysis:
### Introduction :
Lexical analysis is the first phase of a compiler. It takes the modified source code from language preprocessors that are written in the form of sentences. The lexical analyzer breaks these syntaxes into a series of tokens, by removing any whitespace or comments in the source code.
If the lexical analyzer finds a token invalid, it generates an error. The lexical analyzer works closely with the syntax analyzer. It reads character streams from the source code, checks for legal tokens, and passes the data to the syntax analyzer when it demands.
![lexer](https://user-images.githubusercontent.com/38635461/58596372-11534d80-8274-11e9-8aa7-9d27ebfb1648.PNG)


### Regular Expressions:

The lexical analyzer needs to scan and identify only a finite set of valid string/token/lexeme that belong to the language in hand. It searches for the pattern defined by the language rules.
Regular expressions have the capability to express finite languages by defining a pattern for finite strings of symbols. The grammar defined by regular expressions is known as regular grammar.
The language defined by regular grammar is known as regular language.
Regular expression is an important notation for specifying patterns. 
Each pattern matches a set of strings, so regular expressions serve as names for a set of strings. Programming language tokens can be described by regular languages. The specification of regular expressions is an example of a recursive definition. Regular languages are easy to understand and have efficient implementation.
There are a number of algebraic laws that are obeyed by regular expressions, which can be used to manipulate regular expressions into equivalent forms.
For more info, 
please check: https://www.tutorialspoint.com/compiler_design/compiler_design_regular_expressions.htm
### Code Specification:
1) A program that takes a single command-line argument . That argument will be an ASCII text Cool source file. Your program must either indicate that there is an error in the input (e.g., a malformed string) or emit file.cl-lex.
2)Test cases good.cl and bad.cl. The first should lex correctly and yield a sequence of tokens. The second should contain an error.
**good**
![goodlexer](https://user-images.githubusercontent.com/38635461/58597314-ab68c500-8277-11e9-8a7a-a9bea0116eac.jpg)
## 2)Parser
### Introduction :
Syntax analyzers follow production rules defined by means of context-free grammar. The way the production rules are implemented (derivation) divides parsing into two types : top-down parsing and bottom-up parsing.

**Top-down Parsing**
When the parser starts constructing the parse tree from the start symbol and then tries to transform the start symbol to the input, it is called top-down parsing.
- <b>Recursive descent parsing </b>: It is a common form of top-down parsing. It is called recursive as it uses recursive procedures to process the input. Recursive descent parsing suffers from backtracking.
- <b>Backtracking </b>: It means, if one derivation of a production fails, the syntax analyzer restarts the process using different rules of same production. This technique may process the input string more than once to determine the right production. 

**Bottom-up Parsing**
  As the name suggests, bottom-up parsing starts with the input symbols and tries to construct the parse tree up to the start symbol.
  ###  in our code the parsing type is **Top-down Parsing**
 ### Code Specification:
  *  A program that takes a single command-line argument (e.g., file.cl-lex). That argument will be an ASCII text Cool tokens file (as described in the lexer programming assignment). The cl-lex file will always be well-formed (i.e., there will be no syntax errors in the cl-lex file itself).
  f your program is called parser, invoking parser file.cl-lex should yield the same output as cool --parse file.cl.
Your program can take another argument which is the file to print the output of the Concrete Syntax Tree (CST) as follows: parser file.cl-lex file.cl-cst.
  Your program should determine and print any errors in the parsing tree and terminate the program.
  * Test cases good.cl and bad.cl. The first should parse correctly and yield an abstract syntax tree. The second should contain an error.
  
   **good result**
   ![goodparser](https://user-images.githubusercontent.com/38635461/58598772-f8e83080-827d-11e9-84c7-53226c5f3126.jpg)
   **bad result**
   ![badparser](https://user-images.githubusercontent.com/38635461/58599460-ab20f780-8280-11e9-85a6-bbeaf1a59d5d.jpg)
## 3)Three Address Code Generation
### Introduction :
 In this phase our goal  is to translate  source code in order to generate the equivalent three address code .<br>
First we have to know how to represent three address code for some instructions , check this document for more info :<br>
https://web.stanford.edu/class/archive/cs/cs143/cs143.1128/handouts/240%20TAC%20Examples.pdf?fbclid=IwAR3-QkY7RplMtEWVtp1tV7rkXMnBD_If26Yd51hMxLUzBLZ4PciqF3IlOvA <br>
So , How to implement this ? <br>
**There are many ways :** <br>
  **1-** Use Antlr visitors and listeners <br>
  **2-** Use the generated CST from Antlr parsers using Antlr's API.<br>
  **3-** Build your CLASS TRANSALTOR then create a class for each rule in our grammer .<br>
  **We use in our project the thrid method** <br>
  
### Code Specification:
**1)** Test cases good.cl and bad.cl. The first should generate code correctly and yield three address code. The second should contain an error <br>
   **good result**
   ![61890439_362868391006499_2202922922648010752_n (1)](https://user-images.githubusercontent.com/44041416/58601765-9f3a3300-828a-11e9-90bc-1386613372ea.jpg)
  **bad result**
  ![bad2](https://user-images.githubusercontent.com/44041416/58601871-022bca00-828b-11e9-98f8-d566d369c962.jpg) <br>
**2)** Scope Handler for error <br>
in this part of code we assign for each variable that appear for first time its scope <br>
```
public class Scope {
    public Hashtable<String, Token> hashtable = new Hashtable<>();

    Scope() {
    }

    //push new token into hash table
    void addToken(Token token) {
        if (this.hashtable.containsKey(token.name))
            throw new RuntimeException(
                    String.format(
                            "Translation.Token %s already declared in scope %s",
                            token.name,
                            this
                    )
            );

        this.hashtable.put(token.name, token);
        token.scopeName = this.toString();
    }
```

Every time new variable added we push it into new scope <br>
```
 private static Vector<Scope> scopes =new Vector<>();

    //push new scope
    public static void pushScope() {

        Scope newScope = new Scope();
        scopes.add(scopes.size(), newScope);
    }
```
So if Variable in source code doesn't exist in any scope , Error appear that variable doesn't declared . <br> <br>
![61504600_2376263755939957_4104285574284705792_n](https://user-images.githubusercontent.com/44041416/58603263-54bbb500-8290-11e9-9b66-b41a104ea1f8.jpg)


  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 
