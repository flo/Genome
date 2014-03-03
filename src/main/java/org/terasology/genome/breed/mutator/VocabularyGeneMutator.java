/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.genome.breed.mutator;

import org.terasology.math.TeraMath;

/**
 * @author Marcin Sciesinski <marcins78@gmail.com>
 */
public class VocabularyGeneMutator implements GeneMutator {
    private char[] vocabulary;

    public VocabularyGeneMutator(String genesVocabulary) {
        vocabulary = genesVocabulary.toCharArray();
    }

    @Override
    public char mutateGene(float input, int geneIndex, char geneValue) {
        return vocabulary[TeraMath.floorToInt(input * vocabulary.length)];
    }
}