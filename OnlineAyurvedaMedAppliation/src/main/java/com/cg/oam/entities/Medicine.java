package com.cg.oam.entities;

import java.time.LocalDate;

public class Medicine {
	String medicineId;
	String medicineName;
	float medicineCost;
	LocalDate mfd;
	LocalDate expiryDate;
	String companyName;
	Category category;

	public Medicine() {
	}

	public Medicine(String medicineId, String medicineName, float medicineCost, LocalDate mfd, LocalDate expiryDate,
			String companyName, Category category) {
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.medicineCost = medicineCost;
		this.mfd = mfd;
		this.expiryDate = expiryDate;
		this.companyName = companyName;
		this.category = category;
	}

	public String getMedicineId() {
		return this.medicineId;
	}

	public void setMedicineId(String medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return this.medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public float getMedicineCost() {
		return this.medicineCost;
	}

	public void setMedicineCost(float medicineCost) {
		this.medicineCost = medicineCost;
	}

	public LocalDate getMfd() {
		return this.mfd;
	}

	public void setMfd(LocalDate mfd) {
		this.mfd = mfd;
	}

	public LocalDate getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}