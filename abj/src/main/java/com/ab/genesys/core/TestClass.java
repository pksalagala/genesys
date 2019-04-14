package com.ab.genesys.core;


import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

import javax.annotation.Nonnull;
import javax.annotation.meta.When;
import java.util.concurrent.ThreadLocalRandom;

@Getter
@Setter
public class TestClass {

    @Nonnull(when = When.ALWAYS)
    private String name;

}
