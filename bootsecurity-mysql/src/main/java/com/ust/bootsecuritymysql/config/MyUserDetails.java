package com.ust.bootsecuritymysql.config;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;

import com.ust.bootsecuritymysql.model.MyUser;

public class MyUserDetails implements UserDetails {
private String username;
private String password;
private List<GrantedAuthority> authorities;//EXTRACT THE ROLES

public MyUserDetails(MyUser user) {
	username=user.getUsername();
	password=user.getPassword();
	authorities=Arrays.stream(user.getRole().split(","))
			.map(SimpleGrantedAuthority::new)
			.collect(Collectors.toList());
	//String role="ADMIN,USER,OPS,HR"
	//CONVERTING A COMMA SEPERATED STRING INTO AN ARRAYLIST
}


@Override
public String getPassword() {
	return password;
}


@Override
public String getUsername() {
	return username;
}

@Override
public boolean isAccountNonLocked() {
	return true;
}
@Override
public boolean isAccountNonExpired() {
	return true;
}
@Override
public boolean isCredentialsNonExpired() {
	return true;
}

@Override
public boolean isEnabled() {
 return true;
}



@Override
public Collection<? extends GrantedAuthority> getAuthorities() {
	// TODO Auto-generated method stub
	return authorities;
}
}