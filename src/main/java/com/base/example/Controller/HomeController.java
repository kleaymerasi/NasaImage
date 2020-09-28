package com.base.example.Controller;

import com.base.example.Model.NasaImageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/home")
@Controller
public class HomeController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public ModelAndView show(ModelAndView model) {
        String url = "https://api.nasa.gov/planetary/apod?api_key=vBazgpQKv1DHjGf8o6IcZUIQ2XSO8Tz9fBbqSkJl";
        NasaImageInfo nasaImage = restTemplate.getForObject(url, NasaImageInfo.class);
        model.addObject("nasaImage", nasaImage);
        model.setViewName("/Hello");
        return model;
    }
}