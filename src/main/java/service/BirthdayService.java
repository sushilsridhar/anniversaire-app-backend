package service;

import entity.BirthdayEntity;
import dao.BirthdayRepo;
import dto.BirthdayDto;
import helpers.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import constants.Constants;

@Service
public class BirthdayService {

    @Autowired
    BirthdayRepo birthdayRepo;

    public String addBirthday(BirthdayDto birthdayDto) {

        BirthdayEntity birthdayEntity = Mapper.MapToEntity(birthdayDto);
        BirthdayEntity entity = birthdayRepo.save(birthdayEntity);

        return Constants.BIRTHDAY_ADDED;
    }

    public ArrayList<BirthdayDto> fetchAllBirthdays() {

        Iterable<BirthdayEntity> birthdayEntities = birthdayRepo.findAll();

        return Mapper.MapToDto(birthdayEntities);
    }

    public ArrayList<BirthdayDto> fetchBirthdaysToday() {

        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd"));

        Iterable<BirthdayEntity> birthdayEntities = birthdayRepo.findByDate(currentDate);

        return Mapper.MapToDto(birthdayEntities);
    }

    public String updateBirthday(BirthdayDto birthdayDto) {

        BirthdayEntity birthdayEntity = Mapper.MapToEntity(birthdayDto);
        birthdayRepo.save(birthdayEntity);

        return Constants.BIRTHDAY_UPDATED;
    }

    public String deleteBirthday(Integer id) {
         birthdayRepo.deleteById(id);
         return Constants.BIRTHDAY_DELETED;
    }
}
