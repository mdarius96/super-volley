package com.android.supervolley.annotation;

import com.android.supervolley.SuperVolley.Builder;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import okhttp3.HttpUrl;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Make an OPTIONS request.
 */
@Documented
@Target(METHOD)
@Retention(RUNTIME)
public @interface OPTIONS {
    /**
     * A relative or absolute path, or full URL of the endpoint. This value is optional if the first
     * parameter of the method is annotated with {@link Url @Url}.
     * <p>
     * See {@linkplain Builder#baseUrl(HttpUrl) base URL} for details of how
     * this is resolved against a base URL to create the full endpoint URL.
     */
    String value() default "";
}
