package ibs.util;

import ibs.entities.RegistrationEntity;

import ibs.model.RegistrationModel;

public class EMParser {
	
	public static RegistrationModel parse(RegistrationEntity registration) {
		RegistrationModel target = new RegistrationModel();
		target.setFullName(registration.getFullName());
		target.setDateofBirth(registration.getDateofBirth());
		target.setGender(registration.getGender());
		target.setEmail_id(registration.getEmail_id());
		target.setMobileNumber(registration.getMobileNumber());
		target.setAddress(registration.getAddress());
		target.setCity(registration.getCity());
		target.setPinCode(registration.getPinCode());
		target.setRoleId(registration.getRoleId());
		target.setAccountType(registration.getAccountType());
		target.setKycDoc(registration.getKycDoc());
		
		return target;
	}
	
	public static RegistrationEntity parse(RegistrationModel source) {
		RegistrationEntity target = new RegistrationEntity();
		target.setFullName(source.getFullName());
		target.setDateofBirth(source.getDateofBirth());
		target.setGender(source.getGender());
		target.setEmail_id(source.getEmail_id());
		target.setMobileNumber(source.getMobileNumber());
		target.setAddress(source.getAddress());
		target.setCity(source.getCity());
		target.setPinCode(source.getPinCode());
		target.setRoleId(source.getRoleId());
		target.setAccountType(source.getAccountType());
		target.setKycDoc(source.getKycDoc());
		return target;
	}

	/*
	 * public static ContactModel_Old parse(ContactEntity_Old source) {
	 * ContactModel_Old target = new ContactModel_Old();
	 * target.setContactId(source.getContactId());
	 * target.setFirstName(source.getFirstName());
	 * target.setLastNAme(source.getLastNAme());
	 * target.setContactDetails(parse(source.getContactDetails()));
	 * target.setAdbGroup(parse(source.getAdbGroup())); return target; }
	 * 
	 * public static ContactEntity_Old parse(ContactModel_Old source) {
	 * ContactEntity_Old target = new ContactEntity_Old();
	 * target.setContactId(source.getContactId());
	 * target.setFirstName(source.getFirstName());
	 * target.setLastNAme(source.getLastNAme());
	 * target.setContactDetails(parse(source.getContactDetails()));
	 * target.setAdbGroup(parse(source.getAdbGroup())); return target; }
	 * 
	 * public static AddressGroup_Old parse(AddressGroupModel_Old source) {
	 * AddressGroup_Old target = new AddressGroup_Old();
	 * target.setGroupId(source.getGroupId());
	 * target.setGroupTitle(source.getGroupTitle()); return target; }
	 * 
	 * public static AddressGroupModel_Old parse(AddressGroup_Old source) {
	 * AddressGroupModel_Old target = new AddressGroupModel_Old();
	 * target.setGroupId(source.getGroupId());
	 * target.setGroupTitle(source.getGroupTitle()); return target; }
	 */}
