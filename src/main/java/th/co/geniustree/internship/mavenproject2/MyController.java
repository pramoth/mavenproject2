/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.internship.mavenproject2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pramoth
 */
@RestController
public class MyController {
    @RequestMapping("/private/rest")
    public String rest(){
        return "rest";
    }
}
