package com.adii.graphsudoku.domain

import java.io.Serializable

/**
 * A node in a sudoku puzzle is denoted by:
 *
 * - A value or a color, which is an integer denoted by the set of allowed numbers in the game
 * - A list of x and y values where:
 *  - top left is x0, y0 (0 based indexing is used)
 *  - bottom right is xn-1, yn-1, where n is the largest int in the set of allowed numbers
 *
 */
data class SudokuNode(
    val x: Int,
    val y: Int,
    val color: Int = 0,
    val readOnly: Boolean = true,
): Serializable {
    override fun hashCode(): Int {
        return getHash(x, y)
    }
}

internal fun getHash(x: Int, y: Int): Int {
    val newX = x * 100
    return "$x$y".toInt()
}