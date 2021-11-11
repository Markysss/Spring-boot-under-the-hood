package spring.under.hood;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;
import java.util.Arrays;

public class TrimmerAnnotationBeanPostProcessor implements BeanPostProcessor {

    @Override
    @SneakyThrows
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        var declaredFields = bean.getClass().getDeclaredFields();
        final Field stringField = Arrays.stream(declaredFields)
                .filter(field -> field.isAnnotationPresent(Trimmer.class))
                .findAny()
                .orElseThrow();
        stringField.setAccessible(true);
        var str = (String) stringField.get(bean);
        stringField.set(bean,str.replace(" " , ""));
        return bean;
    }

    @Override
    @SneakyThrows
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
