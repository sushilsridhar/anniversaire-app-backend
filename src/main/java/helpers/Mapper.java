package helpers;

import entity.BirthdayEntity;
import dto.BirthdayDto;

import java.util.ArrayList;

public class Mapper {

    public static ArrayList<BirthdayDto> MapToDto(Iterable<BirthdayEntity> birthdayEntities) {

        ArrayList<BirthdayDto> birthdayDtoArrayList = new ArrayList<>();

        birthdayEntities.forEach(entity -> {
            BirthdayDto birthdayDto = new BirthdayDto();
            birthdayDto.setId(entity.getId());
            birthdayDto.setFirstName(entity.getFirstName());
            birthdayDto.setLastName(entity.getLastName());
            birthdayDto.setCompanyName(entity.getCompanyName());
            birthdayDto.setBirthday(entity.getBirthday());

            birthdayDto.setAge(Analytics.calculateAge(entity.getBirthday()));

            birthdayDtoArrayList.add(birthdayDto);
        });

        return birthdayDtoArrayList;
    }

    public static BirthdayEntity MapToEntity(BirthdayDto birthdayDto) {

        BirthdayEntity birthdayEntity = new BirthdayEntity();

        if(birthdayDto.getId() != null) {
            birthdayEntity.setId(birthdayDto.getId());
        }

        birthdayEntity.setFirstName(birthdayDto.getFirstName());
        birthdayEntity.setLastName(birthdayDto.getLastName());
        birthdayEntity.setCompanyName(birthdayDto.getCompanyName());
        birthdayEntity.setBirthday(birthdayDto.getBirthday());

        return birthdayEntity;
    }
}
