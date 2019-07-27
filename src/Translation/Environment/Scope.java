package Translation.Environment;

import Translation.Token;

import java.util.Hashtable;

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


    //return scope for given token
    Token getToken(String name , int num) {
        System.out.println(String.format("token %s is declared in scope %d",name,num));
        return this.hashtable.get(name);
    }

    @Override
    public String toString() {
        return null;
    }


}