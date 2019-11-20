package com.rushop.model.impl;

import com.rushop.model.CatService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("catB")
//@Primary
public class CatServiceBarsikImpl implements CatService {
    @Override
    public String getName() {
        return "Barsik";
    }
}
