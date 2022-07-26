package wchub.userservice.impl.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import wchub.userservice.api.resource.VideoResource;

@RestController
public class VideoResourceImpl implements VideoResource {

    //Принимает видео с клиента и отдаёт его сервису для дальнейшего форка
    @Override
    public ResponseEntity<?> livestream(long userId, MultipartFile video) {
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
