    package com.example.driversmart.component;
    import lombok.extern.slf4j.Slf4j;
    import org.springframework.context.annotation.Primary;
    import org.springframework.stereotype.Component;


    @Slf4j
    @Component
    public class Football implements Sport{


        @Override
        public void sport() {
            log.info("playing football");
        }
    }


