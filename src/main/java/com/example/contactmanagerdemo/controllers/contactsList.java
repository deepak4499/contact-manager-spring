package com.example.contactmanagerdemo.controllers;

import com.example.contactmanagerdemo.ContactManagerDemoApplication;
import com.example.contactmanagerdemo.models.Contact;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class contactsList {
    public final List<Contact> contacts = new ArrayList<>();
    @GetMapping("/contacts")
    public String showContacts(Model model) {
        Contact contact1 = new Contact("1", "Deepak", "sdk@gmail.com", "7874389234", "Mohan");
        contacts.add(contact1);
        model.addAttribute("contactsList",contacts);
        return ContactManagerDemoApplication.indexLayout(model,"contacts");
    }

    @GetMapping("/add-contact")
    public String addNewContact(Model model) {
        model.addAttribute("newContact", new Contact("2", "DK","","",""));
        return ContactManagerDemoApplication.indexLayout(model,"add-contact");
    }
    @PostMapping("/add-contact")
    public String addContact(@ModelAttribute Contact newContact, Model model) {
        contacts.add(newContact);
        model.addAttribute("contactsList",contacts);
        return ContactManagerDemoApplication.indexLayout(model,"contacts");
    }
}
