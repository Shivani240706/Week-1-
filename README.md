# Week 1 — Water Quality Prediction (30% Milestone)

## Project Title:
Water Quality Prediction using Machine Learning (Java + WEKA)

## Problem Statement:
Water is essential for life, but not all water is safe to drink. Lab testing is expensive and time-consuming.  
Using Java code and WEKA, we can process water data and predict whether it is safe to drink or not based on chemical features.

## Objectives:
1. Understand the dataset
2. Perform basic analysis using Java
3. Check missing values in dataset
4. Document results and WEKA outputs for Week 1

## Dataset Description:
- Rows: 3,277  
- Columns: 10  
- Features: pH, Hardness, Solids, Chloramines, Sulfate, Conductivity, Organic_carbon, Trihalomethanes, Turbidity  
- Target: Potability (1 = safe, 0 = not safe)

## Files in Repository:
- `WaterQualityCheck.java` → Load dataset and print first 5 rows  
- `MissingValuesCheck.java` → Count missing values per column  
- `/screenshots/` → WEKA screenshots showing dataset analysis

## Observations:
- Dataset loaded successfully in Java.  
- First 5 rows displayed using Java code.  
- Some columns have missing values (e.g., pH, Sulfate, Trihalomethanes).  
- WEKA screenshots confirm dataset analysis.  
- Next steps for Week 2: data cleaning and ML model building.
