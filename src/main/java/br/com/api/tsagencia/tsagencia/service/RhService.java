package br.com.api.tsagencia.tsagencia.service;

import br.com.api.tsagencia.tsagencia.model.rh.*;
import br.com.api.tsagencia.tsagencia.repository.rh.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RhService {
    private final EmployeeRepository employeeRepository;
    private final EmployeeAllocationRepository employeeAllocationRepository;
    private final EmployeeBriefingRepository employeeBriefingRepository;
    private final EmployeeContractRepository employeeContractRepository;
    private final EmployeeEmailRepository employeeEmailRepository;
    private final EmployeePhoneRepository employeePhoneRepository;
    private final OrganizationalUnitRepository organizationalUnitRepository;

    public RhService(
            EmployeeRepository employeeRepository,
            EmployeeAllocationRepository employeeAllocationRepository,
            EmployeeBriefingRepository employeeBriefingRepository,
            EmployeeContractRepository employeeContractRepository,
            EmployeeEmailRepository employeeEmailRepository,
            EmployeePhoneRepository employeePhoneRepository,
            OrganizationalUnitRepository organizationalUnitRepository
    ) {
        this.employeeRepository = employeeRepository;
        this.employeeAllocationRepository =  employeeAllocationRepository;
        this.employeeBriefingRepository = employeeBriefingRepository;
        this.employeeContractRepository = employeeContractRepository;
        this.employeeEmailRepository = employeeEmailRepository;
        this.employeePhoneRepository = employeePhoneRepository;
        this.organizationalUnitRepository = organizationalUnitRepository;
    }

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<EmployeeAllocation> getAllEmployeeAllocation() {
        return employeeAllocationRepository.findAll();
    }

    public EmployeeAllocation saveEmployeeAllocation(EmployeeAllocation employeeAllocation) {
        return employeeAllocationRepository.save(employeeAllocation);
    }

    public List<EmployeeBriefing> getAllEmployeeBriefing() {
        return employeeBriefingRepository.findAll();
    }

    public EmployeeBriefing saveEmployeeBriefing(EmployeeBriefing employeeBriefing) {
        return employeeBriefingRepository.save(employeeBriefing);
    }

    public List<EmployeeContract> getAllEmployeeContract() {
        return employeeContractRepository.findAll();
    }

    public EmployeeContract saveEmployeeContract(EmployeeContract employeeContract) {
        return employeeContractRepository.save(employeeContract);
    }

    public List<EmployeeEmail> getAllEmployeeEmail() {
        return employeeEmailRepository.findAll();
    }

    public EmployeeEmail saveEmployeeEmail(EmployeeEmail employeeEmail) {
        return employeeEmailRepository.save(employeeEmail);
    }

    public List<EmployeePhone> getAllEmployeePhone() {
        return employeePhoneRepository.findAll();
    }

    public EmployeePhone saveEmployeePhone(EmployeePhone employeePhone) {
        return employeePhoneRepository.save(employeePhone);
    }

    public List<OrganizationalUnit> getAllOrganizationalUnit() {
        return organizationalUnitRepository.findAll();
    }

    public OrganizationalUnit saveOrganizationUnit(OrganizationalUnit organizationalUnit) {
        return organizationalUnitRepository.save(organizationalUnit);
    }
}