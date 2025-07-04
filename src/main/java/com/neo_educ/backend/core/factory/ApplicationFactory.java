package com.neo_educ.backend.core.factory;


import com.neo_educ.backend.core.service.ActivityGeneratorService;
import com.neo_educ.backend.core.service.AuthService;
import com.neo_educ.backend.core.service.ClientService;
import com.neo_educ.backend.core.service.SessionService;
import com.neo_educ.backend.core.service.UserService;

/**
 * Abstract Factory que define o contrato para a criação de todos os componentes
 * necessários para uma aplicação específica (módulo de negócio).
 *
 * Cada aplicação (inglês, nutrição, etc.) deverá fornecer uma implementação concreta
 * desta fábrica.
 */
public interface ApplicationFactory {

    /**
     * Cria uma instância do serviço de autenticação específico da aplicação.
     * @return Uma implementação de AuthService.
     */
    AuthService createAuthService();

    /**
     * Cria uma instância do serviço de usuário específico da aplicação.
     * Este serviço lidará com as operações do tipo de usuário principal
     * (Professor, Nutricionista, etc.).
     * @return Uma implementação de UserService.
     */
    UserService createUserService();

    /**
     * Cria uma instância do serviço de geração de atividades com IA,
     * específico para o contexto da aplicação.
     * @return Uma implementação de ActivityGeneratorService.
     */
    ActivityGeneratorService createActivityGeneratorService();

    /**
     * Cria uma instância do serviço de sessão específico da aplicação.
     * @return Uma implementação de SessionService.
     */
    SessionService<?, ?, ?> createSessionService(); 

    /**
     * Cria uma instância do serviço de cliente específico da aplicação.
     * @return Uma implementação de ClientService.
     */
    ClientService<?, ?, ?> createClientService();

}
