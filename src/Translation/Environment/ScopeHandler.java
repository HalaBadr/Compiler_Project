package Translation.Environment;

import Translation.Token;

import java.util.Vector;

public class ScopeHandler {

    ScopeHandler (){
    }
    private static Vector<Scope> scopes =new Vector<>();

    //push new scope
    public static void pushScope() {

        Scope newScope = new Scope();
        scopes.add(scopes.size(), newScope);
    }
    //remove current scope
    public static void popScope() {
        scopes.remove(scopes.size()-1);

    }
    //search from the current scope to the first scope about the given token
    public static Token getToken(String name) {
        int currentScopeIndex = scopes.size()-1;

        while (currentScopeIndex >= 0) {
            Scope currentScope = scopes.get(currentScopeIndex);
            if (currentScope.hashtable.containsKey(name)) return currentScope.getToken(name,currentScopeIndex+1);
            currentScopeIndex--;
        }

        throw new RuntimeException("Translation.Token " + name + " not found !");
    }
    //add current token to the current scope
    public static void addToken(Token token) {
        scopes.get(scopes.size()-1).addToken(token);
    }

    
}