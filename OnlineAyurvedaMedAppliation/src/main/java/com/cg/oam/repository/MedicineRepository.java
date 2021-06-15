package com.cg.oam.repository;

public interface MedicineRepository {
	Medicine addMedicine(Medicine var1);

	Medicine viewMedicine(Medicine var1);

	Medicine updateMedicine(Medicine var1) throws MedicineNotFoundException;

	Medicine deleteMedicine(int var1) throws MedicineNotFoundException;

	List<Medicine> showAllMedicine();

}
