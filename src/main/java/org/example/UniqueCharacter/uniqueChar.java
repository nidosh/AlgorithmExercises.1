package org.example.UniqueCharacter;

public class uniqueChar {
    public static void main(String[] args) {

        String str  = "tobeto";

        for (int i = 0; i < str.length() ; i++)
        {
            for (int j = i+1; j < str.length(); j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    System.out.println("Stringde tekrar eden karakter var.");
                    return;
                }
            }
        }
        System.out.println("Stringde tekrar eden karakter yok.");
}
}
