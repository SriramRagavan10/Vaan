package com.studentmarksheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentmarksheet.entity.MarkSheet;
import com.studentmarksheet.service.MarkSheetService;

@RestController
@RequestMapping(value = "/marksheet")
public class MarkSheetController {

	@Autowired
	MarkSheetService markSer;

	@PostMapping(value = "/insertMarks")
	public String insert(@RequestBody MarkSheet mark) {
		return markSer.insert(mark);
	}

	@PostMapping(value = "/insertAllMarks")
	public String inserAll(@RequestBody List<MarkSheet> mark) {
		return markSer.inserAll(mark);
	}

	@GetMapping(value = "/getAllMarks")
	public List<MarkSheet> semsTotal() {
		return markSer.getAll();
	}

}
