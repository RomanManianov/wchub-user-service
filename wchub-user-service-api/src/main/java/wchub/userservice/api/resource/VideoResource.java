package wchub.userservice.api.resource;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("/api/v1/video")
public interface VideoResource {

    @ApiOperation("Получение потокового видео с клиента")
    @PostMapping(value = "/live_stream/{uuid}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    ResponseEntity<?> livestream(@PathVariable("uuid") long userId, MultipartFile video);
}
