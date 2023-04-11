package pro.sky.springdemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class СalculatorController {
    private final СalculatorService сalculatorService;

    public СalculatorController(СalculatorService сalculatorService) {
       this.сalculatorService=сalculatorService;
    }

    @GetMapping
    public String calculator(){
        return сalculatorService.calculator();
    }@GetMapping("/plus")
    public String summ(@RequestParam int num1,@RequestParam int num2){
        return сalculatorService.summ(num1,num2);
    }@GetMapping("/minus")
    public String minus(@RequestParam int num1,@RequestParam int num2){
        return сalculatorService.minus(num1,num2);
    }@GetMapping("/multiply")
    public String multiply(@RequestParam int num1,@RequestParam int num2){
        return сalculatorService.multiply(num1,num2);
    }@GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2){
        return сalculatorService.divide(num1,num2);
    }

}