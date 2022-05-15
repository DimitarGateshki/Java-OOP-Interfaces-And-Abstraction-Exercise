package Тelephony;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Callable,Browsable  {
    private List<String>  numbers;
    private List<String>  urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder sb=new StringBuilder();
        Pattern pattern=Pattern.compile("^[^0-9]+$");
        for (String el:this.urls) {
            Matcher matcher=pattern.matcher(el);
            if(matcher.find()) {
                sb.append("Browsing: " + el + '!');
            }else {
                sb.append("Invalid URL!");

            }
            sb.append(System.lineSeparator());
        }
        return String.valueOf(sb).trim();
    }

    @Override
    public String call() {
        StringBuilder sb=new StringBuilder();

        Pattern pattern=Pattern.compile("^[0-9]+$");
        for (String el:this.numbers) {
            Matcher matcher=pattern.matcher(el);
            if(matcher.find()) {
                sb.append("Calling... "+el);
            }else {
                sb.append("Invalid number!");

            }
            sb.append(System.lineSeparator());
        }
        return String.valueOf(sb);

    }
}
