package com.spring.form.controller;

import com.spring.form.Entity.FieldData;
import com.spring.form.Entity.FieldDataWrapper;
import com.spring.form.Entity.FieldNumber;
import com.spring.form.Entity.RadioEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;


@Controller
public class FormController {

    public static final String PROJECT_DIRECTORY = "/icons/";

    @RequestMapping(value = "/fieldmaker", method = RequestMethod.GET)
    public String filedMakerHomeLoader(FieldNumber fieldNumber,Model model)
    {
        String path = PROJECT_DIRECTORY+"formHeader.png";

        model.addAttribute("path",path);
        return "home";
    }


    @RequestMapping(value = "/fieldmaker",method = RequestMethod.POST)
    public String fieldMaker(FieldNumber fieldNumber, Model model)
    {
        FieldDataWrapper wrapper = new FieldDataWrapper();
        wrapper.setListSize(fieldNumber.getNum());

        List<FieldData> fieldDatas = new ArrayList<FieldData>();

        for(int i=0; i<fieldNumber.getNum(); i++)
        {
            fieldDatas.add(new FieldData(i+1,"","","",""));
        }

        wrapper.setFieldDataList(fieldDatas);

        String radioArray[] = {"Text", "Email", "Number", "Password", "File", "Textarea"};
        List<RadioEntity> radioEntityList = new ArrayList<RadioEntity>();

        for (int i=0; i<radioArray.length; i++)
        {
           radioEntityList.add(new RadioEntity(i+1,radioArray[i]));
        }

        for (int i=0; i<radioArray.length; i++)
        {
            System.out.println(radioEntityList.get(i).getRadioFieldName());
        }

        model.addAttribute("filedNumber",fieldNumber);
        model.addAttribute("wrapper",wrapper);
        model.addAttribute("radioEntityList",radioEntityList);

        return "dynamicForm";
    }

/*
    @RequestMapping(value = "/userform",method = RequestMethod.GET)
    public String userFormMakerGet(Model model)
    {
        FieldDataWrapper wrapper = new FieldDataWrapper();
        model.addAttribute("wrapper",wrapper);
        return "dynamicForm";
    }
*/


    @RequestMapping(value = "/userform",method = RequestMethod.POST)
    public String userFormMakerPost(@ModelAttribute FieldDataWrapper wrapper, Model model)
    {
      //  wrapper.setListSize(listSize);
        model.addAttribute("wrapper",wrapper);
        return "userForm";
    }

   /*


    @RequestMapping(value = "/userform",method = RequestMethod.POST)
    public String userFormMakerPost(@ModelAttribute("formAttribute") List<FieldData>  fieldDatas,  Model model)
    {
        model.addAttribute("fieldDatas",fieldDatas);
        return "userForm";
    }


*/
}
