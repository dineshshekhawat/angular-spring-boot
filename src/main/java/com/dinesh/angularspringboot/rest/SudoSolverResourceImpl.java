package com.dinesh.angularspringboot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dinesh.angularspringboot.dto.SudokuDTO;
import com.dinesh.angularspringboot.service.SudokuSolverService;

@RestController
@RequestMapping("/sudokusolver")
public class SudoSolverResourceImpl {

	@Autowired
	private SudokuSolverService sudokuSolverService;
	
	@PostMapping
	public ResponseEntity<SudokuDTO> solveSudoku(@RequestBody SudokuDTO sudokuDTO) {
		SudokuDTO result = sudokuSolverService.solveSudoku(sudokuDTO);
		return ResponseEntity.ok(result);
	}
	
}
