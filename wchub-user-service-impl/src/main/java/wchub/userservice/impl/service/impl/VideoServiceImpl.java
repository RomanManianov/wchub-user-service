package wchub.userservice.impl.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;
import wchub.userservice.impl.service.VideoService;

@Service
public class VideoServiceImpl implements VideoService {
    @Override
    public StreamingResponseBody convert(byte[] video) {
        return null;
    }
}
