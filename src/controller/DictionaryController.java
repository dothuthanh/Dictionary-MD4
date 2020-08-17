package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    private static Map<String, String> dictionary;
    static {
        dictionary=new HashMap<>();
        dictionary.put("hello", "xin chào");
        dictionary.put("day", "ngày");
        dictionary.put("name", "tên");
        dictionary.put("email", "thư");
    }
    @RequestMapping("/home")
    public String home() {
        return "dictionary";
    }
    @PostMapping("/search")
    public String search(@RequestParam String engWord, Model model){
        String Result="";
        if (dictionary.keySet().contains(engWord.toLowerCase())){
            Result=dictionary.get(engWord.toLowerCase());
        }
        model.addAttribute("Result", Result);
//        model.addAttribute("engWord", engWord);
        return "dictionary";
    }
}
