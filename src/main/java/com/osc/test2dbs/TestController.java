package com.osc.test2dbs;

import com.osc.test2dbs.repositories.central.SuperUserRepository;
import com.osc.test2dbs.repositories.local.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class TestController {
    @Autowired
    private SuperUserRepository superUserRepository;
    @Autowired
    private RoomRepository roomRepository;

    @PostMapping("/add/user")
    public void addUser(@RequestBody SuperUser user) {
        this.superUserRepository.save(user);
    }

    @PostMapping("/add/room")
    public void addRoom(@RequestBody Room room) {
        this.roomRepository.save(room);
    }

    @GetMapping("/get/users")
    public List<SuperUser> getUsers() {
        return this.superUserRepository.findAll();
    }

    @GetMapping("/get/rooms")
    public List<Room> getRooms() {
        return this.roomRepository.findAll();
    }
}
