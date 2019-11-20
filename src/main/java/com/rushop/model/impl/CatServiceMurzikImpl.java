package com.rushop.model.impl;

import com.rushop.model.CatService;
import org.springframework.stereotype.Service;

@Service("catM")
public class CatServiceMurzikImpl implements CatService {
    @Override
    public String getName() {
        return "Murzik";
    }
}
