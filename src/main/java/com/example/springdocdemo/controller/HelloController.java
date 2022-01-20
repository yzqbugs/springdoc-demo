package com.example.springdocdemo.controller;

import com.example.springdocdemo.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanni
 * @date time 2022/1/21 3:06
 * @modified By:
 */
@RestController
@RequestMapping("/user")
public class HelloController {
    /**
     * should be
     * <pre>
     *        "parameters": [
     *           {
     *             "name": "username",
     *             "in": "query",
     *             "description": "The user name for login",
     *             "required": true,
     *             "schema": {
     *               "type": "string"
     *             }
     *           },
     *           {
     *             "name": "password",
     *             "in": "query",
     *             "description": "The password for login in clear text",
     *             "required": true,
     *             "schema": {
     *               "type": "string"
     *             }
     *           }
     *         ],
     * </pre>
     *
     * @param user
     * @return {@link User}
     */
    @PostMapping("/query")
    public User query(User user) {
        return user;
    }

    /**
     *should be
     * <pre>
     *      "requestBody": {
     *                     "content": {
     *                         "application/json": {
     *                             "schema": {
     *                                 "$ref": "#/components/schemas/User"
     *                             }
     *                         }
     *                     },
     *                     "required": true
     *                 },
     * </pre>
     *
     * @param user
     * @return {@link User}
     */
    @PostMapping("/body")
    public  User body(@RequestBody  User user) {
        return user;
    }
}
