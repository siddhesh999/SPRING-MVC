package com.te.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.te.controller.daolayer.DaoLayer;
import com.te.controller.model.Register;

@Component
public class MvcService {
@Autowired
DaoLayer layer;

public void save(Register reg) {
	if (reg != null) {
		layer.put(reg);
	}
}
}
