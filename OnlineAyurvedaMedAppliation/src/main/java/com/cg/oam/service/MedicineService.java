package com.cg.oam.service;

import com.cg.oam.entities.Medicine;

public interface MedicineService {
	Medicine addMedicine(Medicine var1);

	Medicine viewMedicine(Medicine var1);

	Medicine updateMedicine(Medicine var1) throws MedicineNotFoundException;

	Medicine deleteMedicine(int var1) throws MedicineNotFoundException;

	List<Medicine> showAllMedicine();

}
