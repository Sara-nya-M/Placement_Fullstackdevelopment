package com.example.frontendbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.lang.Math;
import java.util.Map;

import static java.lang.Math.log;

@RestController

public class CalcController {
    @GetMapping("/calc/add/{a}/{b}")
    public Map<String, Object> add(@PathVariable int a, @PathVariable int b) {
        return Map.of("operation", "addition", "result", a + b);
    }

    @GetMapping("/calc/square/{num}")
    public String sqr(@PathVariable double num) {
        double squarer = Math.sqrt(num);
        return "Square root of the number is : " + squarer;

    }

    @GetMapping("/calc/power/{num1}/{num2}")
    public String poww(@PathVariable double num1, @PathVariable double num2) {
        return "Power of number is : " + Math.pow(num1, num2);
    }

    @GetMapping("/calc/log/{a}")
    public String log(@PathVariable double a) {
        return "Log (base e): " + Math.log(a);

    }

    @GetMapping("/calc/tan/{a}")
    public String tan(@PathVariable double a) {
        return "Tan: " + Math.tan(Math.toRadians(a));
    }

    @GetMapping("/calc/sin/{a}")
    public String sin(@PathVariable double a) {
        return "Tan: " + Math.sin(Math.toRadians(a));
    }

    @GetMapping("/calc/cos/{a}")
    public String cos(@PathVariable double a) {
        return "Tan: " + Math.cos(Math.toRadians(a));
    }

    @GetMapping("/calc/abs/{a}")
    public String abs(@PathVariable int a) {
        return "Absolute: " + Math.abs(a);
    }

    @GetMapping("/spiral")
    public String getSpiral() {

            int[][] mat = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12}
            };

            int n = mat.length;
            int m = mat[0].length;

            int top = 0;
            int bottom = n - 1;
            int left = 0;
            int right = m - 1;

            StringBuilder result = new StringBuilder();

            while (top <= bottom && left <= right) {

                for (int j = left; j <= right; j++) {
                    result.append(mat[top][j]).append(" ");
                }
                top++;

                for (int i = top; i <= bottom; i++) {
                    result.append(mat[i][right]).append(" ");
                }
                right--;

                if (top <= bottom) {
                    for (int j = right; j >= left; j--) {
                        result.append(mat[bottom][j]).append(" ");
                    }
                    bottom--;
                }

                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        result.append(mat[i][left]).append(" ");
                    }
                    left++;
                }
            }

            return result.toString();
        }
    }






