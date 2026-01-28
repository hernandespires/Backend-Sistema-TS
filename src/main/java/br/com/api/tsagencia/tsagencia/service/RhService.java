package br.com.api.tsagencia.tsagencia.service;

import br.com.api.tsagencia.tsagencia.model.rh.*;
import br.com.api.tsagencia.tsagencia.repository.rh.*;
import jakarta.persistence.EntityNotFoundException;
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

    private final String successfullyDeletedMessage = "Registro deletado com sucesso";

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

    public Employee getEmployeeById(String id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Colaborador não encontrado"));
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee editEmployee(String id, Employee employee) {
        Employee employeeFound = getEmployeeById(id);

        employeeFound.setName(employee.getName());
        employeeFound.setBirthday(employee.getBirthday());
        employeeFound.setCivilState(employee.getCivilState());
        // employeeFound.setNacionality(employee.getNacionality());
        employeeFound.setRg(employee.getRg());
        employeeFound.setCpf(employee.getCpf());
        employeeFound.setEmail(employee.getEmail());
        employeeFound.setMotherName(employee.getMotherName());
        employeeFound.setPhone(employee.getPhone());
        employeeFound.setCity(employee.getCity());
        employeeFound.setPostalCode(employee.getPostalCode());
        employeeFound.setStreet(employee.getStreet());
        employeeFound.setNeighborhood(employee.getNeighborhood());
        employeeFound.setWorkCard(employee.getWorkCard());
        employeeFound.setPisPasep(employee.getPisPasep());
        employeeFound.setTypeEmployment(employee.getTypeEmployment());
        employeeFound.setLaborModality(employee.getLaborModality());
        employeeFound.setLaborScale(employee.getLaborScale());
        employeeFound.setAdmissionDate(employee.getAdmissionDate());
        employeeFound.setSalary(employee.getSalary());
        employeeFound.setResidentialProve(employee.getResidentialProve());
        employeeFound.setReservist(employee.getReservist());
        employeeFound.setDocumentation(employee.getDocumentation());
        employeeFound.setBank(employee.getBank());
        employeeFound.setAgency(employee.getAgency());
        employeeFound.setAccount(employee.getAccount());
        employeeFound.setPix(employee.getPix());
        employeeFound.setTransportationVoucher(employee.getTransportationVoucher());
        employeeFound.setCnpjTransportationVoucher(employee.getCnpjTransportationVoucher());
        employeeFound.setMonthlyAmount(employee.getMonthlyAmount());
        employeeFound.setAdditionalDocuments(employee.getAdditionalDocuments());
        employeeFound.setDepartment(employee.getDepartment());
        employeeFound.setOperation(employee.getOperation());
        employeeFound.setLevel(employee.getLevel());
        employeeFound.setStatus(employee.getStatus());
        employeeFound.setQuitDate(employee.getQuitDate());

        return employeeFound;
    }

    public String deleteEmployee(String id) {
        employeeRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<EmployeeAllocation> getAllEmployeeAllocation() {
        return employeeAllocationRepository.findAll();
    }

    public EmployeeAllocation getEmployeeAllocationById(String id) {
        return employeeAllocationRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Alocação do colaborador não encontrada"));
    }

    public EmployeeAllocation saveEmployeeAllocation(EmployeeAllocation employeeAllocation) {
        return employeeAllocationRepository.save(employeeAllocation);
    }

    public EmployeeAllocation editEmployeeAllocation(String id, EmployeeAllocation employeeAllocation) {
        EmployeeAllocation employeeAllocationFound = getEmployeeAllocationById(id);

        employeeAllocationFound.setEmployee(employeeAllocation.getEmployee());
        employeeAllocationFound.setOrganizationalUnit(employeeAllocation.getOrganizationalUnit());
        employeeAllocationFound.setDocument(employeeAllocation.getDocument());
        employeeAllocationFound.setStartDate(employeeAllocation.getStartDate());
        employeeAllocationFound.setEndDate(employeeAllocation.getEndDate());
        employeeAllocationFound.setObservations(employeeAllocation.getObservations());
        return employeeAllocationFound;
    }

    public String deleteEmployeeAllocation(String id) {
        employeeAllocationRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<EmployeeBriefing> getAllEmployeeBriefing() {
        return employeeBriefingRepository.findAll();
    }

    public EmployeeBriefing getEmployeeBriefingById(String id) {
        return employeeBriefingRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Briefing do colaborador não encontrado"));
    }

    public EmployeeBriefing saveEmployeeBriefing(EmployeeBriefing employeeBriefing) {
        return employeeBriefingRepository.save(employeeBriefing);
    }

    public EmployeeBriefing editEmployeeBriefing(String id, EmployeeBriefing employeeBriefing) {
        EmployeeBriefing employeeBriefingFound = getEmployeeBriefingById(id);

        employeeBriefingFound.setBriefing(employeeBriefing.getBriefing());
        employeeBriefingFound.setEmployee(employeeBriefing.getEmployee());
        employeeBriefingFound.setFunction(employeeBriefing.getFunction());
        employeeBriefingFound.setStartResponsibilityDate(employeeBriefing.getStartResponsibilityDate());
        employeeBriefingFound.setEndResponsibilityDate(employeeBriefing.getEndResponsibilityDate());
        employeeBriefingFound.setStatus(employeeBriefing.getStatus());
        return employeeBriefingFound;
    }

    public String deleteEmployeeBriefing(String id) {
        employeeBriefingRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<EmployeeContract> getAllEmployeeContract() {
        return employeeContractRepository.findAll();
    }

    public EmployeeContract getEmployeeContractById(String id) {
        return employeeContractRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Contrato do colaborador não encontrado"));
    }

    public EmployeeContract saveEmployeeContract(EmployeeContract employeeContract) {
        return employeeContractRepository.save(employeeContract);
    }

    public EmployeeContract editEmployeeContract(String id, EmployeeContract employeeContract) {
        EmployeeContract employeeContractFound = getEmployeeContractById(id);

        employeeContractFound.setEmployee(employeeContract.getEmployee());
        employeeContractFound.setContract(employeeContract.getContract());
        employeeContractFound.setCommissionPercentage(employeeContract.getCommissionPercentage());
        employeeContractFound.setCommissionValue(employeeContract.getCommissionValue());
        employeeContractFound.setParticipationDate(employeeContract.getParticipationDate());
        employeeContractFound.setObservations(employeeContract.getObservations());
        return employeeContractFound;
    }

    public String deleteEmployeeContract(String id) {
        employeeContractRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<EmployeeEmail> getAllEmployeeEmail() {
        return employeeEmailRepository.findAll();
    }

    public EmployeeEmail getEmployeeEmailById(String id) {
        return employeeEmailRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Email do colaborador não encotrado"));
    }

    public EmployeeEmail saveEmployeeEmail(EmployeeEmail employeeEmail) {
        return employeeEmailRepository.save(employeeEmail);
    }

    public EmployeeEmail editEmployeeEmail(String id, EmployeeEmail employeeEmail) {
        EmployeeEmail employeeEmailFound = getEmployeeEmailById(id);

        employeeEmailFound.setEmployee(employeeEmail.getEmployee());
        employeeEmailFound.setEmail(employeeEmail.getEmail());
        employeeEmailFound.setDocument(employeeEmail.getDocument());
        employeeEmailFound.setTag(employeeEmail.getTag());
        return employeeEmailFound;
    }

    public String deleteEmployeeEmail(String id) {
        employeeEmailRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<EmployeePhone> getAllEmployeePhone() {
        return employeePhoneRepository.findAll();
    }

    public EmployeePhone getEmployeePhoneById(String id) {
        return employeePhoneRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Celular do colaborador não encontrado"));
    }

    public EmployeePhone saveEmployeePhone(EmployeePhone employeePhone) {
        return employeePhoneRepository.save(employeePhone);
    }

    public EmployeePhone editEmployeePhone(String id, EmployeePhone employeePhone) {
        EmployeePhone employeePhoneFound = getEmployeePhoneById(id);

        employeePhoneFound.setEmployee(employeePhone.getEmployee());
        employeePhoneFound.setTag(employeePhone.getTag());
        employeePhoneFound.setDdi(employeePhone.getDdi());
        employeePhoneFound.setDdd(employeePhone.getDdd());
        employeePhoneFound.setPrefix(employeePhone.getPrefix());
        employeePhoneFound.setSuffix(employeePhone.getSuffix());
        employeePhoneFound.setType(employeePhone.getType());
        return employeePhoneFound;
    }

    public String deleteEmployeePhone(String id) {
        employeePhoneRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<OrganizationalUnit> getAllOrganizationalUnit() {
        return organizationalUnitRepository.findAll();
    }

    public OrganizationalUnit getOrganizationUnitById(String id) {
        return organizationalUnitRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Unidade organizacional não encontrado"));
    }

    public OrganizationalUnit saveOrganizationalUnit(OrganizationalUnit organizationalUnit) {
        return organizationalUnitRepository.save(organizationalUnit);
    }

    public OrganizationalUnit editOrganizationalUnit(String id, OrganizationalUnit organizationalUnit) {
        OrganizationalUnit organizationalUnitFound = getOrganizationUnitById(id);

        organizationalUnitFound.setClient(organizationalUnit.getClient());
        organizationalUnitFound.setName(organizationalUnit.getName());
        organizationalUnitFound.setType(organizationalUnit.getType());
        organizationalUnitFound.setCode(organizationalUnit.getCode());
        return organizationalUnitFound;
    }

    public String deleteOrganizationalUnit(String id) {
        organizationalUnitRepository.deleteById(id);
        return successfullyDeletedMessage;
    }
}