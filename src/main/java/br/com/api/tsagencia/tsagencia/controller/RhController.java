package br.com.api.tsagencia.tsagencia.controller;

import br.com.api.tsagencia.tsagencia.model.rh.*;
import br.com.api.tsagencia.tsagencia.service.RhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rh")
public class RhController {
    @Autowired
    private RhService service;

    @GetMapping(value = "/allEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getAllEmployee() {
        return service.getAllEmployee();
    }

    @GetMapping(value = "/getEmployee/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee getEmployeeById(@PathVariable String id) {
        return service.getEmployeeById(id);
    }

    @PostMapping(
            value = "/saveEmployee",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Employee saveEmployee(@RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }

    @PutMapping(
            value = "/editEmployee/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Employee editEmployeeById(@PathVariable String id, @RequestBody Employee employee) {
        return service.editEmployee(id, employee);
    }

    @DeleteMapping(value = "/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable String id) {
        return service.deleteEmployee(id);
    }

    @GetMapping(value = "/allEmployeeAllocation", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeeAllocation> getAllEmployeeAllocation() {
        return service.getAllEmployeeAllocation();
    }

    @GetMapping(value = "/getEmployeeAllocation/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public EmployeeAllocation getEmployeeAllocationById(@PathVariable String id) {
        return service.getEmployeeAllocationById(id);
    }

    @PostMapping(
            value = "/saveEmployeeAllocation",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public EmployeeAllocation saveEmployeeAllocation(@RequestBody EmployeeAllocation employeeAllocation) {
        return service.saveEmployeeAllocation(employeeAllocation);
    }

    @PutMapping(
            value = "/editEmployeeAllocation/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public EmployeeAllocation editEmployeeAllocation(
            @PathVariable String id, @RequestBody EmployeeAllocation employeeAllocation
    ) {
        return service.editEmployeeAllocation(id, employeeAllocation);
    }

    @DeleteMapping(value = "/deleteEmployeeAllocation/{id}")
    public String deleteEmployeeAllocation(@PathVariable String id) {
        return service.deleteEmployeeAllocation(id);
    }

    @GetMapping(value = "/allEmployeeBriefing", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeeBriefing> getAllEmployeeBriefing() {
        return service.getAllEmployeeBriefing();
    }

    @GetMapping(value = "/getEmployeeBriefing/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public EmployeeBriefing getEmployeeBriefingById(@PathVariable String id) {
        return service.getEmployeeBriefingById(id);
    }

    @PostMapping(
            value = "/saveEmployeeBriefing",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public EmployeeBriefing saveEmployeeBriefing(@RequestBody EmployeeBriefing employeeBriefing) {
        return service.saveEmployeeBriefing(employeeBriefing);
    }

    @PutMapping(
            value = "/editEmployeeBriefing/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public EmployeeBriefing editEmployeeBriefing(
            @PathVariable String id, @RequestBody EmployeeBriefing employeeBriefing
    ) {
        return service.editEmployeeBriefing(id, employeeBriefing);
    }

    @DeleteMapping(value = "/deleteEmployeeBriefing/{id}")
    public String deleteEmployeeBriefing(@PathVariable String id) {
        return service.deleteEmployeeBriefing(id);
    }

    @GetMapping(value = "/allEmployeeContract", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeeContract> getAllEmployeeContract() {
        return service.getAllEmployeeContract();
    }

    @GetMapping(value = "/getEmployeeContractById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public EmployeeContract getEmployeeContractById(@PathVariable String id) {
        return service.getEmployeeContractById(id);
    }

    @PostMapping(
            value = "/saveEmployeeContract",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public EmployeeContract saveEmployeeContract(@RequestBody EmployeeContract employeeContract) {
        return service.saveEmployeeContract(employeeContract);
    }

    @PutMapping(
            value = "/editEmployeeContract/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public EmployeeContract editEmployeeContract(
            @PathVariable String id, @RequestBody EmployeeContract employeeContract
    ) {
        return service.editEmployeeContract(id, employeeContract);
    }

    @DeleteMapping(value = "/deleteEmployeeContract/{id}")
    public String deleteEmployeeContract(@PathVariable String id) {
        return service.deleteEmployeeContract(id);
    }

    @GetMapping(value = "/allEmployeeEmail", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeeEmail> getAllEmployeeEmail() {
        return service.getAllEmployeeEmail();
    }

    @GetMapping(value = "/getEmployeeEmail/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public EmployeeEmail getEmployeeEmailById(@PathVariable String id) {
        return service.getEmployeeEmailById(id);
    }

    @PostMapping(
            value = "/saveEmployeeEmail",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public EmployeeEmail saveEmployeeEmail(@RequestBody EmployeeEmail employeeEmail) {
        return service.saveEmployeeEmail(employeeEmail);
    }

    @PutMapping(
            value = "/editEmployeeEmail/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public EmployeeEmail editEmployeeEmail(@PathVariable String id, @RequestBody EmployeeEmail employeeEmail) {
        return service.editEmployeeEmail(id, employeeEmail);
    }

    @DeleteMapping(value = "/deleteEmployeeEmail/{id}")
    public String deleteEmployeeEmail(@PathVariable String id) {
        return service.deleteEmployeeEmail(id);
    }

    @GetMapping(value = "/allEmployeePhone", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeePhone> getAllEmployeePhone() {
        return service.getAllEmployeePhone();
    }

    @GetMapping(value = "/getEmployeePhone/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public EmployeePhone getEmployeePhoneById(@PathVariable String id) {
        return service.getEmployeePhoneById(id);
    }

    @PostMapping(
            value = "/saveEmployeePhone",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public EmployeePhone saveEmployeePhone(@RequestBody EmployeePhone employeePhone) {
        return service.saveEmployeePhone(employeePhone);
    }

    @PutMapping(
            value = "/editEmployeePhone/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public EmployeePhone editEmployeePhone(@PathVariable String id, @RequestBody EmployeePhone employeePhone) {
        return service.editEmployeePhone(id, employeePhone);
    }

    @DeleteMapping(value = "/deleteEmployeePhone/{id}")
    public String deleteEmployeePhone(@PathVariable String id) {
        return service.deleteEmployeePhone(id);
    }

    @GetMapping(value = "/allOrganizationalUnit", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<OrganizationalUnit> getAllOrganizationalUnit() {
        return service.getAllOrganizationalUnit();
    }

    @GetMapping(value = "/getOrganizationalUnit/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public OrganizationalUnit getOrganizationalUnit(@PathVariable String id) {
        return service.getOrganizationUnitById(id);
    }

    @PostMapping(
            value = "/saveOrganizationalUnit",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public OrganizationalUnit saveOrganizationalUnit(@RequestBody OrganizationalUnit organizationalUnit) {
        return service.saveOrganizationalUnit(organizationalUnit);
    }

    @PutMapping(
            value = "/editOrganizationalUnit/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public OrganizationalUnit editOrganizationalUnit(
            @PathVariable String id, @RequestBody OrganizationalUnit organizationalUnit
    ) {
        return editOrganizationalUnit(id, organizationalUnit);
    }

    @DeleteMapping(value = "/deleteOrganizationalUnit/{id}")
    public String deleteOrganizationalUnit(String id) {
        return service.deleteOrganizationalUnit(id);
    }
}