package com.example.patrons_uf3_m6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HolaMonController {

  @GetMapping()
  public String hola(Model model) {
    model.addAttribute("salutacio", "Hola Mon Spring amb Java configuration");
    return "benvinguda";
  }

  @GetMapping("/holadenou")
  public String holaDeNou(Model model) {
    model.addAttribute("salutacio", "Hola Mon de nou Spring amb Java configuration");
    return "benvinguda";
  }
}
