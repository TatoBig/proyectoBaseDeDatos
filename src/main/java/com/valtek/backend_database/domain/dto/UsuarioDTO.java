package com.valtek.backend_database.domain.dto;

public class UsuarioDTO {
    private String username;
    private String password;

    public UsuarioDTO() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
