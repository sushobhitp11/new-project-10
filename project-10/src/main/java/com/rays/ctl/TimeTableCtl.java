package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.TimeTableDTO;
import com.rays.form.TimeTableForm;
import com.rays.service.TimeTableServiceInt;

@RestController
@RequestMapping(value = "Timetable")
public class TimeTableCtl extends BaseCtl<TimeTableForm, TimeTableDTO, TimeTableServiceInt> {

}
