package controller;

import dto.BirthdayDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import service.BirthdayService;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping(path = "/birthday")
public class BirthdayController {

    @Autowired
    BirthdayService birthdayService;

    @RequestMapping(method = RequestMethod.GET)
    public ArrayList<BirthdayDto> fetchAllBirthdays() {
        return birthdayService.fetchAllBirthdays();
    }

    @RequestMapping(path="/today", method = RequestMethod.GET)
    public ArrayList<BirthdayDto> fetchBirthdaysToday() {
        return birthdayService.fetchBirthdaysToday();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public String addBirthday(@Valid @RequestBody BirthdayDto birthdayDto) {
        return birthdayService.addBirthday(birthdayDto);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String updateBirthday(@Valid @RequestBody BirthdayDto birthdayDto) {
        return birthdayService.updateBirthday(birthdayDto);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public String deleteBirthday(@PathVariable("id") Integer id) {
        return birthdayService.deleteBirthday(id);
    }
}
