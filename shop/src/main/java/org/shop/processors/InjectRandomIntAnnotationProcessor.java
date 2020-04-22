package org.shop.processors;

import org.shop.annotations.InjectRandomInt;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class InjectRandomIntAnnotationProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        return init(bean);
    }

    private Object init(Object bean) {
        Class<?> beanClass = bean.getClass();
        Field[] fields = beanClass.getDeclaredFields();
        for (Field field : fields) {
            InjectRandomInt injectRandomInt = field.getAnnotation(InjectRandomInt.class);
            if (Objects.nonNull(injectRandomInt)) {
                int minValue = injectRandomInt.minValue();
                int maxValue = injectRandomInt.maxValue();
                try {
                    field.setAccessible(true);
                    field.setInt(bean, (maxValue - minValue) / 2);
                } catch (IllegalAccessException ignored) {
                    Logger.getLogger(InjectRandomIntAnnotationProcessor.class.getName()).log(Level.WARNING, "Illegal access to field!");
                }
            }
        }
        return bean;
    }
}
