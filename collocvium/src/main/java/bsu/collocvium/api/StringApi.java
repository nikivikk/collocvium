package bsu.collocvium.api;

import bsu.collocvium.functionality.StringFunctionality;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Паттерн Facade (класс StringApi -> класс StringFunctionality)
@RestController
public class StringApi {

    @Autowired
    public StringFunctionality functionality;

    @GetMapping("/concatenate")
    public String concatenate(@RequestParam String s1, @RequestParam String s2) {
        return functionality.concatenate(s1, s2);
    }

    @GetMapping("/copyString")
    public String copyString(@RequestParam String s, @RequestParam int n) {
        return functionality.copyString(s, n);
    }
}