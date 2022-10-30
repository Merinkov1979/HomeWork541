package com.example.homework541.Controller;
import com.example.homework541.Service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class CalculatorController {
    private final CalculatorService calculatorService;

    @GetMapping
    public String Hello(){
        return "Привет , ты в калькуляторе.";
    }
    @GetMapping("/calculator/plus")
    public String plus (@RequestParam(name = "num1") Integer a,
                        @RequestParam(name = "num2") Integer b){
        if (a == null || b == null) return " Один из параметров не введен.";
        int plus = calculatorService.plus(a , b);
        return a + "+" + b + "=" +  plus;

    }
    @GetMapping("/calculator/minus")
    public String minus (@RequestParam(name = "num1")Integer a,
                         @RequestParam(name = "num2")Integer b){
        if (a == null || b == null) return " Один из параметров не введен.";
        int minus = calculatorService.minus(a , b);
        return a + "-" + b + "=" +  minus;

    }
    @GetMapping("/calculator/multiply")
    public String multiply (@RequestParam(name = "num1")Integer a,
                            @RequestParam(name = "num2")Integer b){
        if (a == null || b == null) return " Один из параметров не введен.";
        int multiply = calculatorService.multiply(a , b);
        return a + "*" + b + "=" +  multiply;

    }
    @GetMapping("/calculator/divide")
    public String divide (@RequestParam(name = "num1")Integer a,
                          @RequestParam(name = "num2")Integer b){
        if (a == null || b == null) return " Один из параметров не введен.";
        double divide = calculatorService.divide(a , b);
        return a + "/" + b + "=" +  divide;

    }
}
