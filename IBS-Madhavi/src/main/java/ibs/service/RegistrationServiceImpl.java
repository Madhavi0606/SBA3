package ibs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibs.exception.BankException;
import ibs.model.RegistrationModel;
import ibs.repo.LoginRepository;
import ibs.repo.RegistrationRepo;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationRepo regRepo;
	
	@Autowired
	private LoginRepository loginRepo;

	@Override
	public RegistrationModel add(RegistrationModel registeration) throws BankException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegistrationModel get(long registerationId) throws BankException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RegistrationModel> getAll() throws BankException {
		// TODO Auto-generated method stub
		return null;
	}

	}
