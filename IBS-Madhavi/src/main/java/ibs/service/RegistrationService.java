package ibs.service;

import java.util.List;

import ibs.exception.BankException;
import ibs.model.LoginDetailsModel;
import ibs.model.RegistrationModel;

public interface RegistrationService {

	RegistrationModel add(RegistrationModel registeration) throws BankException;
	RegistrationModel get(long registerationId) throws BankException;	
	List<RegistrationModel> getAll() throws BankException;
	
}
