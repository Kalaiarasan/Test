package net.opentrends.user.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PersonLocalService}.
 *
 * @author Ravi
 * @see PersonLocalService
 * @generated
 */
public class PersonLocalServiceWrapper implements PersonLocalService,
    ServiceWrapper<PersonLocalService> {
    private PersonLocalService _personLocalService;

    public PersonLocalServiceWrapper(PersonLocalService personLocalService) {
        _personLocalService = personLocalService;
    }

    /**
    * Adds the person to the database. Also notifies the appropriate model listeners.
    *
    * @param person the person
    * @return the person that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.user.model.Person addPerson(
        net.opentrends.user.model.Person person)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _personLocalService.addPerson(person);
    }

    /**
    * Creates a new person with the primary key. Does not add the person to the database.
    *
    * @param personId the primary key for the new person
    * @return the new person
    */
    @Override
    public net.opentrends.user.model.Person createPerson(long personId) {
        return _personLocalService.createPerson(personId);
    }

    /**
    * Deletes the person with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param personId the primary key of the person
    * @return the person that was removed
    * @throws PortalException if a person with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.user.model.Person deletePerson(long personId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _personLocalService.deletePerson(personId);
    }

    /**
    * Deletes the person from the database. Also notifies the appropriate model listeners.
    *
    * @param person the person
    * @return the person that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.user.model.Person deletePerson(
        net.opentrends.user.model.Person person)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _personLocalService.deletePerson(person);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _personLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _personLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.user.model.impl.PersonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _personLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.user.model.impl.PersonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _personLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _personLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _personLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public net.opentrends.user.model.Person fetchPerson(long personId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _personLocalService.fetchPerson(personId);
    }

    /**
    * Returns the person with the matching UUID and company.
    *
    * @param uuid the person's UUID
    * @param companyId the primary key of the company
    * @return the matching person, or <code>null</code> if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.user.model.Person fetchPersonByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _personLocalService.fetchPersonByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the person matching the UUID and group.
    *
    * @param uuid the person's UUID
    * @param groupId the primary key of the group
    * @return the matching person, or <code>null</code> if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.user.model.Person fetchPersonByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _personLocalService.fetchPersonByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the person with the primary key.
    *
    * @param personId the primary key of the person
    * @return the person
    * @throws PortalException if a person with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.user.model.Person getPerson(long personId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _personLocalService.getPerson(personId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _personLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the person with the matching UUID and company.
    *
    * @param uuid the person's UUID
    * @param companyId the primary key of the company
    * @return the matching person
    * @throws PortalException if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.user.model.Person getPersonByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _personLocalService.getPersonByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the person matching the UUID and group.
    *
    * @param uuid the person's UUID
    * @param groupId the primary key of the group
    * @return the matching person
    * @throws PortalException if a matching person could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.user.model.Person getPersonByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _personLocalService.getPersonByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns a range of all the persons.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.user.model.impl.PersonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of persons
    * @param end the upper bound of the range of persons (not inclusive)
    * @return the range of persons
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<net.opentrends.user.model.Person> getPersons(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _personLocalService.getPersons(start, end);
    }

    /**
    * Returns the number of persons.
    *
    * @return the number of persons
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPersonsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _personLocalService.getPersonsCount();
    }

    /**
    * Updates the person in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param person the person
    * @return the person that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.user.model.Person updatePerson(
        net.opentrends.user.model.Person person)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _personLocalService.updatePerson(person);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _personLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _personLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _personLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public net.opentrends.user.model.Person addPerson(java.lang.String name,
        java.lang.String sex, int age, java.lang.String city,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _personLocalService.addPerson(name, sex, age, city,
            serviceContext);
    }

    @Override
    public net.opentrends.user.model.Person updateStatus(long userId,
        long personId, int status,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _personLocalService.updateStatus(userId, personId, status,
            serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PersonLocalService getWrappedPersonLocalService() {
        return _personLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPersonLocalService(
        PersonLocalService personLocalService) {
        _personLocalService = personLocalService;
    }

    @Override
    public PersonLocalService getWrappedService() {
        return _personLocalService;
    }

    @Override
    public void setWrappedService(PersonLocalService personLocalService) {
        _personLocalService = personLocalService;
    }
}