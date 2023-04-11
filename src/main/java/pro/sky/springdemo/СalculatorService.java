package pro.sky.springdemo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class СalculatorService {
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String summ(int num1, int num2) {

        int sum = num1 + num2;
        return String.valueOf(sum);
    }

    public String minus(int num1, int num2) {

        int min = num1 - num2;
        return String.valueOf(min);
    }

    public String multiply(int num1, int num2) {

        int multip = num1 * num2;
        return String.valueOf(multip);
    }

    public String divide(int num1, int num2) {


                if (num2 == 0) {
                    return "На 0 делить нельзя";
                }

                int divi = num1 / num2;
                return String.valueOf(divi);
            }
        }

