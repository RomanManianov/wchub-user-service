package wchub.userservice.impl.service;

import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import java.io.IOException;

public interface VideoService {
    StreamingResponseBody convert(byte[] video) throws IOException;
}
