package bsu.collocvium.functionality;

import org.springframework.stereotype.Component;

@Component
public class StringFunctionality {

    public String concatenate(String s1, String s2) {
        return s1.concat(s2);
    }

    public String copyString(String s, int n) {
        String result = s;
        for (int i = 0; i < n - 1; i++) {
            result = result.concat(s);
        }
        return result;
    }
}