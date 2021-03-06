package net.opentrends.user.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.WorkflowDefinitionLinkPersistence;
import com.liferay.portal.service.persistence.WorkflowInstanceLinkPersistence;

import com.liferay.portlet.asset.service.persistence.AssetEntryPersistence;

import net.opentrends.user.model.Person;
import net.opentrends.user.service.PersonService;
import net.opentrends.user.service.persistence.AddressPersistence;
import net.opentrends.user.service.persistence.PersonPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the person remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link net.opentrends.user.service.impl.PersonServiceImpl}.
 * </p>
 *
 * @author Ravi
 * @see net.opentrends.user.service.impl.PersonServiceImpl
 * @see net.opentrends.user.service.PersonServiceUtil
 * @generated
 */
public abstract class PersonServiceBaseImpl extends BaseServiceImpl
    implements PersonService, IdentifiableBean {
    @BeanReference(type = net.opentrends.user.service.AddressLocalService.class)
    protected net.opentrends.user.service.AddressLocalService addressLocalService;
    @BeanReference(type = net.opentrends.user.service.AddressService.class)
    protected net.opentrends.user.service.AddressService addressService;
    @BeanReference(type = AddressPersistence.class)
    protected AddressPersistence addressPersistence;
    @BeanReference(type = net.opentrends.user.service.PersonLocalService.class)
    protected net.opentrends.user.service.PersonLocalService personLocalService;
    @BeanReference(type = net.opentrends.user.service.PersonService.class)
    protected net.opentrends.user.service.PersonService personService;
    @BeanReference(type = PersonPersistence.class)
    protected PersonPersistence personPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    @BeanReference(type = com.liferay.portal.service.WorkflowDefinitionLinkLocalService.class)
    protected com.liferay.portal.service.WorkflowDefinitionLinkLocalService workflowDefinitionLinkLocalService;
    @BeanReference(type = WorkflowDefinitionLinkPersistence.class)
    protected WorkflowDefinitionLinkPersistence workflowDefinitionLinkPersistence;
    @BeanReference(type = com.liferay.portal.service.WorkflowInstanceLinkLocalService.class)
    protected com.liferay.portal.service.WorkflowInstanceLinkLocalService workflowInstanceLinkLocalService;
    @BeanReference(type = WorkflowInstanceLinkPersistence.class)
    protected WorkflowInstanceLinkPersistence workflowInstanceLinkPersistence;
    @BeanReference(type = com.liferay.portlet.asset.service.AssetEntryLocalService.class)
    protected com.liferay.portlet.asset.service.AssetEntryLocalService assetEntryLocalService;
    @BeanReference(type = com.liferay.portlet.asset.service.AssetEntryService.class)
    protected com.liferay.portlet.asset.service.AssetEntryService assetEntryService;
    @BeanReference(type = AssetEntryPersistence.class)
    protected AssetEntryPersistence assetEntryPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private PersonServiceClpInvoker _clpInvoker = new PersonServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link net.opentrends.user.service.PersonServiceUtil} to access the person remote service.
     */

    /**
     * Returns the address local service.
     *
     * @return the address local service
     */
    public net.opentrends.user.service.AddressLocalService getAddressLocalService() {
        return addressLocalService;
    }

    /**
     * Sets the address local service.
     *
     * @param addressLocalService the address local service
     */
    public void setAddressLocalService(
        net.opentrends.user.service.AddressLocalService addressLocalService) {
        this.addressLocalService = addressLocalService;
    }

    /**
     * Returns the address remote service.
     *
     * @return the address remote service
     */
    public net.opentrends.user.service.AddressService getAddressService() {
        return addressService;
    }

    /**
     * Sets the address remote service.
     *
     * @param addressService the address remote service
     */
    public void setAddressService(
        net.opentrends.user.service.AddressService addressService) {
        this.addressService = addressService;
    }

    /**
     * Returns the address persistence.
     *
     * @return the address persistence
     */
    public AddressPersistence getAddressPersistence() {
        return addressPersistence;
    }

    /**
     * Sets the address persistence.
     *
     * @param addressPersistence the address persistence
     */
    public void setAddressPersistence(AddressPersistence addressPersistence) {
        this.addressPersistence = addressPersistence;
    }

    /**
     * Returns the person local service.
     *
     * @return the person local service
     */
    public net.opentrends.user.service.PersonLocalService getPersonLocalService() {
        return personLocalService;
    }

    /**
     * Sets the person local service.
     *
     * @param personLocalService the person local service
     */
    public void setPersonLocalService(
        net.opentrends.user.service.PersonLocalService personLocalService) {
        this.personLocalService = personLocalService;
    }

    /**
     * Returns the person remote service.
     *
     * @return the person remote service
     */
    public net.opentrends.user.service.PersonService getPersonService() {
        return personService;
    }

    /**
     * Sets the person remote service.
     *
     * @param personService the person remote service
     */
    public void setPersonService(
        net.opentrends.user.service.PersonService personService) {
        this.personService = personService;
    }

    /**
     * Returns the person persistence.
     *
     * @return the person persistence
     */
    public PersonPersistence getPersonPersistence() {
        return personPersistence;
    }

    /**
     * Sets the person persistence.
     *
     * @param personPersistence the person persistence
     */
    public void setPersonPersistence(PersonPersistence personPersistence) {
        this.personPersistence = personPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    /**
     * Returns the workflow definition link local service.
     *
     * @return the workflow definition link local service
     */
    public com.liferay.portal.service.WorkflowDefinitionLinkLocalService getWorkflowDefinitionLinkLocalService() {
        return workflowDefinitionLinkLocalService;
    }

    /**
     * Sets the workflow definition link local service.
     *
     * @param workflowDefinitionLinkLocalService the workflow definition link local service
     */
    public void setWorkflowDefinitionLinkLocalService(
        com.liferay.portal.service.WorkflowDefinitionLinkLocalService workflowDefinitionLinkLocalService) {
        this.workflowDefinitionLinkLocalService = workflowDefinitionLinkLocalService;
    }

    /**
     * Returns the workflow definition link persistence.
     *
     * @return the workflow definition link persistence
     */
    public WorkflowDefinitionLinkPersistence getWorkflowDefinitionLinkPersistence() {
        return workflowDefinitionLinkPersistence;
    }

    /**
     * Sets the workflow definition link persistence.
     *
     * @param workflowDefinitionLinkPersistence the workflow definition link persistence
     */
    public void setWorkflowDefinitionLinkPersistence(
        WorkflowDefinitionLinkPersistence workflowDefinitionLinkPersistence) {
        this.workflowDefinitionLinkPersistence = workflowDefinitionLinkPersistence;
    }

    /**
     * Returns the workflow instance link local service.
     *
     * @return the workflow instance link local service
     */
    public com.liferay.portal.service.WorkflowInstanceLinkLocalService getWorkflowInstanceLinkLocalService() {
        return workflowInstanceLinkLocalService;
    }

    /**
     * Sets the workflow instance link local service.
     *
     * @param workflowInstanceLinkLocalService the workflow instance link local service
     */
    public void setWorkflowInstanceLinkLocalService(
        com.liferay.portal.service.WorkflowInstanceLinkLocalService workflowInstanceLinkLocalService) {
        this.workflowInstanceLinkLocalService = workflowInstanceLinkLocalService;
    }

    /**
     * Returns the workflow instance link persistence.
     *
     * @return the workflow instance link persistence
     */
    public WorkflowInstanceLinkPersistence getWorkflowInstanceLinkPersistence() {
        return workflowInstanceLinkPersistence;
    }

    /**
     * Sets the workflow instance link persistence.
     *
     * @param workflowInstanceLinkPersistence the workflow instance link persistence
     */
    public void setWorkflowInstanceLinkPersistence(
        WorkflowInstanceLinkPersistence workflowInstanceLinkPersistence) {
        this.workflowInstanceLinkPersistence = workflowInstanceLinkPersistence;
    }

    /**
     * Returns the asset entry local service.
     *
     * @return the asset entry local service
     */
    public com.liferay.portlet.asset.service.AssetEntryLocalService getAssetEntryLocalService() {
        return assetEntryLocalService;
    }

    /**
     * Sets the asset entry local service.
     *
     * @param assetEntryLocalService the asset entry local service
     */
    public void setAssetEntryLocalService(
        com.liferay.portlet.asset.service.AssetEntryLocalService assetEntryLocalService) {
        this.assetEntryLocalService = assetEntryLocalService;
    }

    /**
     * Returns the asset entry remote service.
     *
     * @return the asset entry remote service
     */
    public com.liferay.portlet.asset.service.AssetEntryService getAssetEntryService() {
        return assetEntryService;
    }

    /**
     * Sets the asset entry remote service.
     *
     * @param assetEntryService the asset entry remote service
     */
    public void setAssetEntryService(
        com.liferay.portlet.asset.service.AssetEntryService assetEntryService) {
        this.assetEntryService = assetEntryService;
    }

    /**
     * Returns the asset entry persistence.
     *
     * @return the asset entry persistence
     */
    public AssetEntryPersistence getAssetEntryPersistence() {
        return assetEntryPersistence;
    }

    /**
     * Sets the asset entry persistence.
     *
     * @param assetEntryPersistence the asset entry persistence
     */
    public void setAssetEntryPersistence(
        AssetEntryPersistence assetEntryPersistence) {
        this.assetEntryPersistence = assetEntryPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();
    }

    public void destroy() {
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Person.class;
    }

    protected String getModelClassName() {
        return Person.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = personPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
