package io.cleverapps.aussiedev81.clevercloudspringhowto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;
import org.yaml.snakeyaml.util.UriEncoder;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Map;

@Controller
public class SiteController {

    @GetMapping("/")
    public String index(Model model) {

        String email = "aussiedev81@gmail.com";
        var emailUriLink = UriComponentsBuilder.fromUriString(email)
                .queryParam("subject","RE: Clever Cloud Spring Demo")
                .encode()
                .build()
                .toUriString();

        model.addAttribute("siteTitle","CleverCloud Spring HowTo");
        model.addAllAttributes(Map.of(
                "siteTitle","Clever Cloud Demo",
                "copyrightNotice","Copyright \u00a9 AussieDev81 "+ LocalDate.now().getYear(),//Copyright © AussieDev81 2022
                "email",email,
                "mailtoLink", emailUriLink
        ));
        return "index";
    }

    @GetMapping("/secret")
    public String about(Model model) {
        model.addAllAttributes(Map.of(
                "siteTitle", "Secret Squirrel",
                "wimpNotification", "Yeah you better run"
        ));
        return "secret";
    }

}
